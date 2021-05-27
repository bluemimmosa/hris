INSERT INTO `hris`.`users` (`user_id`, `enabled`, `password`, `user_name`) VALUES ('1', b'1', 'niraj', 'niraj');
INSERT INTO `hris`.`roles` (`role_id`, `name`) VALUES ('1', 'ADMIN');
INSERT INTO `hris`.`roles` (`role_id`, `name`) VALUES ('2', 'USER');
INSERT INTO `hris`.`users_roles` (`user_id`, `role_id`) VALUES ('1', '2');

INSERT INTO `hris`.`employee` (`emp_id`, `dob`, `gender`, `maritial`, `name`, `nationality`) VALUES ('1', '1988-04-20', 'M', 'Married', 'Niraj Khadka', 'Nepali');
INSERT INTO `hris`.`employee` (`emp_id`, `dob`, `gender`, `maritial`, `name`, `nationality`) VALUES ('2', '1995-02-28', 'F', 'Married', 'Rojina Manandhar', 'Nepali');

INSERT INTO `hris`.`address` (`aid`, `district`, `municipality`, `state`, `tole`, `ward_no`) VALUES ('1', 'Kathmandu', 'Shankharapur', 'Bagmati', 'Indrayani', '9');
INSERT INTO `hris`.`permaaddress` (`aid`, `empid`) VALUES ('1', '1');
INSERT INTO `hris`.`permaaddress` (`aid`, `empid`) VALUES ('1', '2');
INSERT INTO `hris`.`tempaddress` (`aid`, `empid`) VALUES ('1', '1');
INSERT INTO `hris`.`tempaddress` (`aid`, `empid`) VALUES ('1', '2');

INSERT INTO `hris`.`office_details` (`oid`, `branch`, `department`, `join_date`, `level`, `office_name`, `perma_date`, `position`) VALUES ('1', 'Sankhu', 'Sales and Marketting', '2017-10-01', 'Assistant', 'Reliance Life Insurance Limited', '2018-04-01', 'Branch Incharge');
INSERT INTO `hris`.`office_details` (`oid`, `branch`, `department`, `join_date`, `level`, `office_name`, `perma_date`, `position`) VALUES ('2', 'NewRoad', 'Under Writing', '2018-06-01', 'Junior Assistant', 'Reliance Life Insurance Limited', '2018-12-01', 'Under Writer');
INSERT INTO `hris`.`od` (`opiid`, `empid`) VALUES ('1', '2');
INSERT INTO `hris`.`od` (`opiid`, `empid`) VALUES ('2', '1');

--INSERT INTO `hris`.`emprole` (`empid`, `role_id`) VALUES ('1', '2');
--INSERT INTO `hris`.`emprole` (`empid`, `role_id`) VALUES ('2', '2');

INSERT INTO `hris`.`contact` (`cid`, `email`, `mobile`, `phone`) VALUES ('1', 'niraj@relifeinsuracne.com', '9840014714', '4245345');
INSERT INTO `hris`.`contact` (`cid`, `email`, `mobile`, `phone`) VALUES ('2', 'rojina@relifeinsurance.com', '9843059542', '4450189');
INSERT INTO `hris`.`contact` (`cid`, `email`, `mobile`, `phone`) VALUES ('3', 'niraj@niraj.com', '9801234567', '4358973');
INSERT INTO `hris`.`contact` (`cid`, `email`, `mobile`, `phone`) VALUES ('4', 'rosy.rojina@gmail.com', '9801233214', '4398722');
INSERT INTO `hris`.`contactdetails` (`empid`, `cid`) VALUES ('1', '1');
INSERT INTO `hris`.`contactdetails` (`empid`, `cid`) VALUES ('1', '3');
INSERT INTO `hris`.`contactdetails` (`empid`, `cid`) VALUES ('2', '2');
INSERT INTO `hris`.`contactdetails` (`empid`, `cid`) VALUES ('2', '4');



