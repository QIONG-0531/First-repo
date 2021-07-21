from selenium import webdriver
import time
import os

driver = webdriver.Chrome()
url = "file:///" + os.path.abspath("C:/Users/22987/Desktop/比特/selenium2html/checkbox.html")
driver.get(url)
inputs = driver.find_elements_by_tag_name("input")
for input in inputs:
    if input.get_attribute('type') == 'checkbox':
        input.click()

time.sleep(3)
driver.quit()

