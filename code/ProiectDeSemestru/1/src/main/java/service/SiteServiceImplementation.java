package service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import entity.Password;
import entity.Site;
import repository.SiteRepository;

public class SiteServiceImplementation implements SiteService {

	 @Autowired
	    private SiteRepository siteRepository;

	public List<Site> findAll() {
		// TODO Auto-generated method stub
		return this.siteRepository.findAll();
	}

	public Optional<Site> findSite(int siteId) {
		// TODO Auto-generated method stub
		Optional<Site> site = this.siteRepository.findById(siteId);
		return site;
	}

	public Site createSite(String name) {
		// TODO Auto-generated method stub
		Site site = new Site(name);
		this.siteRepository.save(site);
		return site;
	}

	public Site updateSite(int siteId, String name) {
		// TODO Auto-generated method stub
		Optional<Site>site = this.siteRepository.findById(siteId);
		if(site.isPresent())
		{
			Site s = site.get();
			s.setName(name);
		}
		return site.orElse(null);
	}

	public void deleteSite(int siteId) {
		// TODO Auto-generated method stub
		Optional<Site> site = this.siteRepository.findById(siteId);
		if(site.isPresent())
		{
			this.siteRepository.deleteById(siteId);
		}
	}

}
