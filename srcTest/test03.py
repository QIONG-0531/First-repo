from selenium import webdriver
import time
import os
# 定位标签是tag的，然后选择checkbox点击
driver = webdriver.Chrome()
file = 'file:///' + os.path.abspath('C:/Users/22987/Desktop/比特/selenium2html/checkbox.html')
driver.get(file)
inputs = driver.find_elements_by_tag_name("input")
for input in inputs:
    if input.get_attribute('type') == 'checkbox':
        input.click()
time.sleep(2)
driver.quit()