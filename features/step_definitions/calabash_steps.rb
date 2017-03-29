require 'calabash-android/calabash_steps'

Given(/^I am on the Login screen$/) do
  wait_for_activity("LoginActivity", timeout: 5)
  raise 'Login button not found' if query("* marked:'loginButton' {text CONTAINS[c] 'Login'}").empty?
  check_element_exists("* marked:'loginButton'")
end

When(/^I enter my credentials (\S*) and (\S*)$/) do | login, password |
  enter_text("* marked:'emailEditTextView'", login)
  enter_text("* marked:'passwordEditTextView'", password)
end

When(/^I press login button$/) do
  tap_when_element_exists("* marked:'loginButton'")
end

Then(/^I see (.*)$/) do | result |
  case result
  when /^errors$/ui
    raise 'Error Email not found' if query("* id:'emailEditTextView'", :getError).empty?
    raise 'Error Password not found' if query("* id:'passwordEditTextView'", :getError).empty?
  when /^snackbar error$/ui
    wait_for_text("Invalid user")
  when /^Logged screen$/ui
    wait_for_activity("ListActivity", timeout: 5)
  when /^item 42 detail screen$/ui
    wait_for_activity("DetailActivity", timeout: 5)
  end
end

Given(/^I am a logged user$/) do
  step "I am on the Login screen"
  step "I enter my credentials toto and truc"
  step "I press login button"
end

When(/^I scroll down to item (\d+)$/) do |itemName|
  sleep(1)
  scroll_to_row("* id:'listView'", 42)
  sleep(1)
end

When(/^I press item (\d+)$/) do |itemName|
  tap_when_element_exists("* {text CONTAINS 'element #{itemName}'}")
end



