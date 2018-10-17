package com.varren.repos;

import com.varren.model.PlacementType;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;


@RepositoryRestResource(
        //exported =  SecurityContextHolder.getContext().getAuthentication() == null
        collectionResourceRel = "placementType",
        path = "placementType")
public interface PlacementTypeRepository extends PagingAndSortingRepository<PlacementType, Long> {
}
