package com.productapp.repo.impl;

import com.productapp.dto.Product;
import com.productapp.repo.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Repository;

import javax.sql.*;
import java.sql.*;
import java.util.LinkedList;
import java.util.List;

@Repository
@Profile(value = "test")
public class ProductRepoJbdcImpl implements ProductRepo {

    private DataSource dataSource;

    @Autowired
    public ProductRepoJbdcImpl(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    @Override
    public List<Product> getAll() {
        List<Product> products=new LinkedList<>();
        Product product=null;

        try (Connection connection=dataSource.getConnection()){
            Statement stmt=connection.createStatement();
            ResultSet rs=stmt.executeQuery("select * from products");
            while (rs.next()){
                product=new Product(rs.getInt(1),rs.getString(2),
                        rs.getDouble(3));
                products.add(product);
            }

        }catch (SQLException e){
            e.printStackTrace();
        }
        return products;
    }

    @Override
    public Product getById(int id) {
        Product product=null;
        try(Connection connection=dataSource.getConnection()){
            PreparedStatement stmt=connection.prepareStatement("select * from products where id=?");
            stmt.setInt(1, id);
            ResultSet rs=stmt.executeQuery();
            if (rs.next()){
                product=new Product(rs.getInt(1),rs.getString(2),
                        rs.getDouble(3));
            }
        }catch (SQLException e){
            System.out.println(e);
        }
        return product;
    }

    @Override
    public Product addProduct(Product product) {

        try(Connection connection=dataSource.getConnection()) {

            PreparedStatement pstmt=connection.
                    prepareStatement("insert into products(name,price) values (?,?)",
                            Statement.RETURN_GENERATED_KEYS);
            pstmt.setString(1, product.getName());
            pstmt.setDouble(2, product.getPrice());
            int noOfRowsEffected= pstmt.executeUpdate();

            ResultSet rs=pstmt.getGeneratedKeys();
            if(rs.next()){
                product.setId(rs.getInt(1));
            }
            System.out.println(noOfRowsEffected);
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
        return product;
    }

    @Override
    public Product deleteProduct(int id) {
        Product productToDelete= getById(id);
        //write the code of delete
        return productToDelete;
    }

    @Override
    public Product updateProduct(int id, Product product) {

        //write the code for update
        return null;
    }
}
