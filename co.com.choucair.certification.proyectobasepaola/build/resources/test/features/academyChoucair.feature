#Autor: Paola Andrea Osma Ramos

@stories
   Feature:Academy Choucair
     As a user,  I want to learn how to automate  in screenplay at the Choucair Academy with the automation course
     @scenariol
     Scenario Outline: Search for a automation course
       Given than brandon wants to learn automation at the academy Choucair
       | strUser   | strPassword  |
       | <strUser>    |<strPassword> |
       When he search for the course Recursos Automatizacion Bancolombia on the choucair academy platform
       | strCourse                |
       | <strCourse> |
       Then he finds the course called resources Recursos Automatizacion Bancolombia
       | strCourse                |
       | <strCourse> |

       Examples:
       | strUser | strPassword  | strCourse |
       | rpenaa  | Febrero.2020 | Metodologia Bancolombia |
