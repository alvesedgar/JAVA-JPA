DELETE FROM Book;
INSERT INTO Book(id, title) VALUES (1, 'Unit Test Hibernate/JPA with in memory H2 Database');
INSERT INTO CUSTOMER(CUST_ID,FIRST_NAME,LAST_NAME,STREET,APPT,CITY,ZIP_CODE,EMAIL,LAST_UPDATED_TIME) 
	VALUES (100,'Jupiter','Jone','10 Downing Street','123','London','12345', 'j@nobody.com', current_timestamp);


