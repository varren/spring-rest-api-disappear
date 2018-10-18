package com.varren.repos;

import com.varren.model.PlacementTheme;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(
        collectionResourceRel = "placementTheme",
        path = "placementTheme")
public interface PlacementThemeRepository extends PagingAndSortingRepository<PlacementTheme, Long> {
}
