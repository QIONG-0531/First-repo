from selenium import webdriver
import time

driver = webdriver.Chrome()
driver.get("file:///C:/Users/22987/Desktop/比特/selenium2html/checkbox.html")

inputs = driver.find_elements_by_tag_name("input")
for input in inputs:
    if input.get_attribute("type") == "checkbox":
        input.click()
time.sleep(2)
driver.quit()