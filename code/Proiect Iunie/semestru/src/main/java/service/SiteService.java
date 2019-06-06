package service;

import java.util.List;

import model.Site;

public interface SiteService {
	List<Site> findAll();

    Site findSite(int siteId);

    Site createSite(Site site);

void deleteSite(Site site);

}
