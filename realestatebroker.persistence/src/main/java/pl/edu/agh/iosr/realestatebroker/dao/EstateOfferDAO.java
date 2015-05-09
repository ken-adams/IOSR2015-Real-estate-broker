package pl.edu.agh.iosr.realestatebroker.dao;

import pl.edu.agh.iosr.realestatebroker.model.EstateOffer;
import java.util.List;

public interface EstateOfferDAO {

    public EstateOffer findById(int id);

    public List<EstateOffer> findAll();

    public List<EstateOffer> findByTitle(String title);

    public void save (EstateOffer estateOffer);

    public void remove(int id);
}