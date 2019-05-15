package repository;

import org.springframework.data.jpa.repository.JpaRepository;

import entity.Site;
public interface SiteRepository extends JpaRepository<Site,Integer>{

}
