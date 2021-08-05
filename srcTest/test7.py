from selenium import webdriver
import time
import os

driver = webdriver.Chrome()
filepath = "file:///"+os.path.abspath("C:/Users/22987/Desktop/比特/selenium2html/drop_down.html")
driver.get(filepath)
m = driver.find_element_by_id("ShippingMethod")
m.find_element_by_xpath('//*[@id="ShippingMethod"]/option[3]').click()
time.sleep(3)
driver.quit()