from selenium import webdriver
from selenium.webdriver.common.keys import Keys
import time
driver = webdriver.Chrome()
driver.get("https://www.baidu.com/")
driver.find_element_by_id("kw").send_keys("aimi")
time.sleep(2)
# 键盘组合键
# ctrl+a 全选输入框内容
driver.find_element_by_id("kw").send_keys(Keys.CONTROL, 'a')
time.sleep(3)
# ctrl+x剪切输入框内容
driver.find_element_by_id("kw").send_keys(Keys.CONTROL, 'x')
time.sleep(3)
driver.find_element_by_id("kw").send_keys("hahhha")
time.sleep(3)
driver.find_element_by_id("su").submit()
time.sleep(2)
driver.quit()

