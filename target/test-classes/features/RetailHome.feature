Feature: Retail Home Page  
 
@retailHomePage
    Scenario Outline: Verify department sidebar options
      When User click on All section
      And User on <department>
      Then below options are present in department
        | <optionOne> | <optionTwo> | 
    
  Examples: 
        | department    | optionOne                      | optionTwo                |
        | 'Electronics' | TV & Video                     | Video Games              |
        | 'Computers'   | Accessories                    | Networking               |
        | 'Smart Home'  | Smart Home Lightning           | Plugs and Outlets        |
        | 'Sports'      | Athletic Clothing              | Exercise & Fitness       |
        | 'Automotive'  | Automative Parts & Accessories | MotorCycle & Powersports |