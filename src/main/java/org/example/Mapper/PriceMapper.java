package org.example.Mapper;

import org.example.Class.Price;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class PriceMapper implements RowMapper<Price> {

    @Override
    public Price mapRow(ResultSet rs, int rowNum) throws SQLException {
        Price price = new Price();
        price.setName(rs.getString("Name"));
        price.setPrice(rs.getString("Price"));
        price.setId(rs.getString("ID"));
        return price;
    }
}
