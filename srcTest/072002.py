from selenium import webdriver
from selenium.webdriver.common.keys import Keys
import time

driver = webdriver.Chrome()
driver.get("http://127.0.0.1:88/zentao/user-login.html")
time.sleep(2)
driver.maximize_window()
driver.find_element_by_id("account").send_keys("admin")
time.sleep(2)
driver.find_element_by_name("password").send_keys("wq20000531..")
time.sleep(2)
# 键盘事件
driver.find_element_by_name("password").send_keys(Keys.ENTER)
time.sleep(3)
driver.quit()