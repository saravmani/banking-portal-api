# Banking Portal Rest API Using Spring Boot & Spring Security

***
Edit
The Banking Portal API provides a set of endpoints for managing user accounts, fund transfers, and transactions. This project aims to facilitate secure and efficient banking operations for users.

## Features


- User Registration: Users can register by providing their details, such as name, email, address, and phone number.
- PIN Management: Users can create and update their PINs for added security.
- Cash Deposit and Withdrawal: Users can deposit and withdraw cash from their accounts.
- Fund Transfer: Users can transfer funds to other accounts within the system.
- Transaction History: Users can view their transaction history.

## Installation and Setup

1. Navigate to the project folder: `cd banking-portal-api`
2. Configure MySQL: Set up a MySQL database, create a copy of application.properties.sample, rename it application.properties, and update the properties as needed.
3. You can build and run the project locally : `mvn spring-boot:run`

## Deployment steps to OCP

1. We have added Dockerfile please take the latest source code.
2. create a copy of `application.properties.sample`, rename it `application.properties` (Using H2 database)

3. Connect to your OCP cluster either via Web OC CLI or local OC CLI using **copy login command** from right top drop down.
  

4. Once connected navigate to the project space:
   Run below command:

   ```oc new-app <YOUR_GIT_URL> --name=<YOUR_BACKEND_API_ANME>```

   This command will create you buildConfig.yaml, deploymeny.yaml and servive.yaml and deployment should be successful.

   **buildconfig.yaml:** Builds an image from the source code (Git, Dockerfile, binary).
   
   **deployment.yaml:** Deploys the built image as a running container in OpenShift.
   
   **service.yaml:** Exposes the deployment inside OpenShift as a network service.

   
   


## Error Handling

The API implements global exception handling for common error scenarios, such as account not found, unauthorized access, and insufficient balance.
