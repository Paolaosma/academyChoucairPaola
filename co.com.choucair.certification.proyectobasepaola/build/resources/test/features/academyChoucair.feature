#Autor: Paola Andrea Osma Ramos

@stories
   Feature:Academy Choucair
     As a user,  I want to learn how to automate  in screenplay at the Choucair Academy with the automation course
     @scenariol
     Scenario Outline: Search for a automation course
       Given than Paola wants to learn automation at the academy Choucair
       | strUser   | strPassword  |
       | <strUser>    |<strPassword> |
       When she search for the course on the choucair academy platform
       | strCourse                |
       | <strCourse> |
       Then she finds the course called
       | strCourse                |
       | <strCourse> |

       Examples:
       | strUser | strPassword  | strCourse |
       | 1028008552  | Choucair2021* | Metodologia Bancolombia |
