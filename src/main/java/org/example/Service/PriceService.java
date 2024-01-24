package org.example.Service;

import lombok.AllArgsConstructor;
import org.example.Class.Price;
import org.example.DAO.PriceDAO;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PriceService {

    private final PriceDAO priceDAO;
    private List<Price> price = new ArrayList<>();

    public PriceService (PriceDAO priceDAO) {
        this.priceDAO = priceDAO;
        price = priceDAO.getAll();
    }

    public List getPriceForID(String ID) {
        List<Price> newPrice = new ArrayList<>();
        for (int i = 0; i < price.size(); i++){
            if(price.get(i).getId().equals(ID)) {
                newPrice.add(price.get(i));
            }
        }
        return newPrice;
    }
}
