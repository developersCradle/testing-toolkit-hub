# Section 02: Introduction to WireMock. 

# What I Learned

# Why WireMock?  

<div align="center">
    <img src="Modern_Software.PNG" alt="wiremock course" width="600"/>
</div>

1. Most **enterprise** business are already transferred into **Microservice Architecture**.
2. Unit test are mandatory!
    - There is less fear, when shipping features when there are automated test!

<div align="center">
    <img src="Restfull_APIs.PNG" alt="wiremock course" width="600"/>
</div>

1. There is client and server. They access each other using endpoints using **HTTP** in internet.

<div align="center">
    <img src="Typical_Restful_Integration.PNG" alt="wiremock course" width="600"/>
</div>

1. The Movies RESTFUL Services is **third party** company providing services.
2. **MoviesApp** is our client application! 
    - We will have `MoviesRestClient`, in which the **REST API** calls will be made!
- We will have automated test to check for integration for as expected, this is done with **JUnit**.
3. Third party will have third party sandbox environment.
    - This is like **production like environment**.

<div align="center">
    <img src="Typical_Restful_Integration_What_Should_Be_Tested.PNG" alt="wiremock course" width="600"/>
</div>

1. What can be tested inside **sandbox environment**.
    - **2xx responses** and **4xx response**!

> [!IMPORTANT]  
>  Just to test these **4xx** and **2xx** are not enough to for a **successful integration**!

<div align="center">
    <img src="Typical_Resful_Integration.PNG" alt="wiremock course" width="600"/>
</div>

1. **Three most** important to be tested!
    - **5xx Responses** these are **default** or **fault** responses!
    - **Latency** from the RESTFUL service.
    - **Timeouts** from the **client side** after request have been made!
    - These are **nearly impossible** be tested in **sandbox environment**!
2. **WireMock** comes in handy in these situations!

<div align="center">
    <img src="Challanges_In_Restful_Integrations.PNG" alt="wiremock course" width="600"/>
</div>

1.

<div align="center">
    <img src="Challenge_Of_Today_Software_Industry.PNG" alt="wiremock course" width="600"/>
</div>
1.
2.

# What is WireMock?  




# WireMock vs Mocking Libraries  
