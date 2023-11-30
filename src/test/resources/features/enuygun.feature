@enuygun @smoke @regression
Feature:Buy plane ticket from Enuygun

  Scenario:TC01 Flight list visibility test
    Given User goes to "url"
    When User chooses the "Ucak bileti" tab
    When User chooses the "Gidis-Donus"
    When User enters departure location "New York"
    When User enters arrival location "Londra"
    When User enters departure date 03 "Mart 2024"
    When User enters arrival date 19 "Haziran 2024"
    When User clicks on Aktarmasiz checkbox
    When User enters the passenger count (Yetiskin 4 Cocuk 3 Bebek 2)
    When User chooses cabin class "Business"
    When User clicks Ucuz bilet bul button
    Then User verifies that flight list page is visible


