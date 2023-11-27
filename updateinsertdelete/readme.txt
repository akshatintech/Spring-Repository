 /*
        1. From studentData getStudent() will be called.This will lead to calling of the Implementation class of the getStudent
        2.Becuase of Run-Time polymorphism it will go into StudentDao class and get StudentId 
        3. After that we create an object of the RowMapper. We directly cannot create an object of RowMapper class becuase it is an Interface
        3. Therefore we create an object of RowMapperImp.
        4. Then we will the set the Data and return the object
        5. Then using the JDBCTemplate object we have called the queryForObject method
        */
