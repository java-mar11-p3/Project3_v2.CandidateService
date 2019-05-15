# Project3_v2.CandidateService

Description
-----------
This candidate microservice is able to insert candidates into a database, as well as retrieve a paginated list of candidates or retrieve a single candidate by id.

Endpoints:
---------

- GET: http://domain-name/candidates/page/{page} (Gets a list of candidates, five at a time)
- GET: http://domain-name/candidates/{id} (Gets a candidate by their id)
- POST: http://domain-name/candidates (Inserts a candidate into the database)

