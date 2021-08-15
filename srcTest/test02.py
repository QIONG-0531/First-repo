from selenium import webdriver
import time
# 鼠标事件
from selenium.webdriver.common.action_chains import ActionChains

driver = webdriver.Chrome()
driver.get("https://www.baidu.com/")
driver.find_element_by_id("kw").send_keys("hahha")
time.sleep(2)
p = driver.find_elements_by_id("su")
# 让driver去点击
ActionChains(driver).context_click(p).perform()
time.sleep(3)
ActionChains(driver).double_click(p).perform()
time.sleep(3)
driver.quit()
