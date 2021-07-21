from selenium import webdriver
from selenium.webdriver.common.action_chains import ActionChains
import time
import os

driver = webdriver.Chrome()
url = "file:///"+os.path.abspath("C:/Users/22987/Desktop/比特/selenium2html/level_locate.html")
driver.get(url)
driver.maximize_window()
time.sleep(3)
driver.find_element_by_link_text("Link1").click()
q = driver.find_element_by_link_text("Another action")
ActionChains(driver).move_to_element(q).perform()
time.sleep(4)
driver.quit()