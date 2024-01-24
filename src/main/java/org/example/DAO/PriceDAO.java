package org.example.DAO;

import lombok.AllArgsConstructor;
import org.example.Class.Price;
import org.example.Interface.DAO;
import org.example.Mapper.PriceMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@AllArgsConstructor
public class PriceDAO implements DAO {

    private final JdbcTemplate jdbcTemplate;

    @Override
    public List getAll() {
        String SQL = "SELECT * FROM \"Price\"";
        List<Price> price = jdbcTemplate.query(SQL, new PriceMapper());
        return price;
    }
}
