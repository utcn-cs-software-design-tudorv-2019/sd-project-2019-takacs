package service;

import java.util.List;
import java.util.Optional;

import entity.Site;

public interface SiteService {

	List<Site> findAll();

    Optional<Site> findSite(int siteId);

    Site createSite(String name);

    Site updateSite(int siteId, String name);

    void deleteSite(int siteId);

}
