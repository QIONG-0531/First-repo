from selenium import webdriver
import time

driver=webdriver.Chrome()
driver.get("file:///C:/Users/22987/Desktop/比特/selenium2html/frame.html")
driver.maximize_window()
time.sleep(2)
driver.switch_to.frame("f1")
driver.switch_to.frame("f2")
driver.find_element_by_id("kw").send_keys("hahhaa")
driver.find_element_by_id("su").click()
time.sleep(2)
driver.switch_to.default_content()
driver.switch_to.frame("f1")
driver.find_element_by_link_text("click").click()
time.sleep(2)
driver.quit()