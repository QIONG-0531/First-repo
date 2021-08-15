from selenium import webdriver
import time
import os
from selenium.webdriver.common.action_chains import ActionChains

driver = webdriver.Chrome()
file = 'file:///' + os.path.abspath('C:/Users/22987/Desktop/比特/selenium2html/level_locate.html')
driver.get(file)

driver.find_element_by_link_text("Link1").click()
time.sleep(2)
q = driver.find_element_by_link_text("Another action")
# 将鼠标定位到该元素上
ActionChains(driver).move_to_element(q).perform()
time.sleep(2)
driver.quit()
