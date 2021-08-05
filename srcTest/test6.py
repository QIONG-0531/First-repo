from selenium import webdriver
import time
import os
from selenium.webdriver.common.action_chains import ActionChains
driver = webdriver.Chrome()
filepath = "file:///"+os.path.abspath("level_locate.html")
driver.get(filepath)
driver.find_element_by_link_text("Link1")
q = driver.find_element_by_link_text("Another action")
ActionChains(driver).context_click(q).perform()
time.sleep(2)
driver.quit()