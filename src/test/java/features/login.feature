Feature:Admin Login successfully with the valid credentials

  @test1
  Scenario:Admin login successfully
  Given admin on login page
    When admin enters username,password
      | username | password |
      | Admin    | Admin    |
    And clicks login button
    Then admin should enter into dashboard page
