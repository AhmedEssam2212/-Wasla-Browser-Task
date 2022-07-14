-- create a table
CREATE TABLE startups (
  id INTEGER PRIMARY KEY,
  funding INTEGER NOT NULL,
  name varchar(255) NOT NULL
);
-- create an index
CREATE INDEX idx_funding
ON startups (funding); 

-- insert some values
INSERT INTO startups VALUES (1,  100, " Wasla Browser");
INSERT INTO startups VALUES (2,  500, " A Company");
INSERT INTO startups VALUES (3,  10, " B Company");
INSERT INTO startups VALUES (4,  1000, " C Company");
INSERT INTO startups VALUES (5,  1044, " D Company");
INSERT INTO startups VALUES (6,  1368, " E Company");
INSERT INTO startups VALUES (7,  1658, " F Company");
INSERT INTO startups VALUES (8,  1110, " G Company");
INSERT INTO startups VALUES (9,  11857, " H Company");
INSERT INTO startups VALUES (10,  200, " I Company");
-- fetch some values

Select * from startups order by funding DESC limit 4,1;

## Note : It is very important to have ORDER BY with LIMIT executed without scanning and sorting full result set, so it is important for it to use index – in this case, index range scan 
## will be started and query execution stopped as soon as required amount of rows generated.
## In our example, I used index on (funding) to get a result set very fast.
## Now what if I have something like SELECT * FROM startups WHERE id=5 ORDER BY funding DESC LIMIT 4,1;
## In this case index by funding may also work but it might not be the most efficient –
## If it is a rare category large portion of table may be scanned to find 1 row. So index on (id, funding) will be a better idea.
## Here we are ordering our funding in descending order so we will get highest fund first and then subsequently lower fund. 
## Here  we are skipping 4 rows from Top and returning only 1 row after skipping .