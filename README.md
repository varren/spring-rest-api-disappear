When i boot the app, both api endpoints work just fine:
http://localhost:8090/api/placement/ => 200 works fine
http://localhost:8090/api/placementType => 200 works fine

But after i visit Placement `@ManyToOne` PlacementType i cant access PlacementType endpoint
http://localhost:8090/api/placement/1/type => 200 works fine
http://localhost:8090/api/placementType => 404