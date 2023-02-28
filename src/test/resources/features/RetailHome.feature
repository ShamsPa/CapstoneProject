Feature: Retail Home Page

	@RetailHomePage
  Scenario Outline: Verify Shop by Department sidebar
    Given User is on retail website
    When User click on All section
    And User on <depatment>
    Then below options are present in Shop by Department sidebar
      | <optionOne> | <optionTwo> |

    Examples: 
      | department  | optionOne                      | OPtionTwo                |
      | 'Electronics' | TV & Video                     | Video Games              |
      | 'Computers'  | Accessories                    | Networking               |
      | 'Smart Home'  | Smart Home Lightning           | Plugs and Outlets        |
      | 'Sports'      | Athletic Clothing              | Exercise & Fitness       |
      | 'Automotive'  | Automative Parts & Accessories | MotorCycle & Powersports |
