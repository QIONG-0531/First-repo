from selenium import webdriver
import time
import os
from selenium.webdriver.common.action_chains import ActionChains
driver = webdriver.Chrome()
url = "file:///" + os.path.abspath("C:/Users/22987/Desktop/比特/selenium2html/drop_down.html")
driver.get(url)
driver.find_element_by_id("ShippingMethod")
time.sleep(2)
driver.find_element_by_xpath("//*[@id='ShippingMethod']/option[2]").click()
time.sleep(2)
driver.quit()