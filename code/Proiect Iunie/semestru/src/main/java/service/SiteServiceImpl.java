package service;

import java.util.List;

import javax.persistence.EntityManager;

import model.Site;
import repo.SiteRepository;

public class SiteServiceImpl implements SiteService{

	private SiteRepository siteRepository;
	public List<Site> findAll() {
		// TODO Auto-generated method stub
		
		return siteRepository.findAll();
	}

	public Site findSite(int siteId) {
		// TODO Auto-generated method stub
		
		return siteRepository.findOne(siteId);
		}

	public Site createSite(Site site) {
		// TODO Auto-generated method stub
		
		return siteRepository.save(site);
	}

	public void deleteSite(Site site) {
		// TODO Auto-generated method stub
		siteRepository.delete(site);
		
	}

}
