# hydra-unavailable-service
* Marks the periods of time (dates) where a person is unavailable
* Unavailability bean is composed of the following: id, startDate, endDate

## Methods:
Service -> ActivatableObjectDaoService
* deleteItem(ID id)
* public void setRepo(ActivatableObjectRepository<T, ID> repo)

Service -> DaoService:
* public T saveItem(T persisted)
* public T getOneItem(ID id)
* public void deleteItem(ID id)
* public List<T> getAllItems()


Controller -> UnavailableCtrl
* (commented out) public Object createUnavailability( @RequestBody UnavailableDTO in )
* public Object retrieveUnavailability( @PathVariable("id") int ID )
* (commented out) public Object updateSkill( @RequestBody UnavailableDTO in )
* (commented out) public Object deleteUnavailability( @PathVariable("id") int ID )
* (commented out) public Object retrieveAllUnavailabilities()

Domain -> Unavailable:
* contains bean class for Unavailable Service

Dao Directory
* contains interfaces("repositories") that are used throughout the serivce: 
* ActivatableObjectRepository/BaseRepository/UnavailableRepository
