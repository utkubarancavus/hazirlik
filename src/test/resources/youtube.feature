Feature: Youtube VIDEO
  @smoke
  Scenario: Go to webpage click video and play it
    Given User navigate to webpage
    Then User send keys to searchbox
    When User click search
    Then User should watch the video