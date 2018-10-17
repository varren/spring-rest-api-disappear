package com.varren.repos;

import com.varren.model.Placement;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(
        //exported =  SecurityContextHolder.getContext().getAuthentication() == null
        //collectionResourceRel = "placement",
        path = "placement")
public interface PlacementRepository extends PagingAndSortingRepository<Placement, Long> {


}
