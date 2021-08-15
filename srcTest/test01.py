from selenium import webdriver
import time

# 键盘事件用法，导包keys
from selenium.webdriver.common.keys import Keys

driver = webdriver.Chrome()
driver.get("https://www.baidu.com/")
driver.maximize_window()
time.sleep(3)
driver.find_element_by_id("kw").send_keys("ninini")
time.sleep(3)
driver.find_element_by_id("kw").send_keys(Keys.CONTROL, 'a')
driver.find_element_by_id("kw").send_keys(Keys.CONTROL, 'x')
time.sleep(3)
driver.find_element_by_id("kw").send_keys("hahahah")
driver.find_element_by_id("su").send_keys(Keys.ENTER)
# driver.find_element_by_id("su").click()
time.sleep(3)
driver.quit()