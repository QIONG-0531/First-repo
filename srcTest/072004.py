from selenium import webdriver
from selenium.webdriver.common.action_chains import ActionChains
import time
driver = webdriver.Chrome()
driver.get("https://www.baidu.com/")
driver.find_element_by_id("kw").send_keys("假期")
time.sleep(2)
q=driver.find_element_by_id("su")
# 右击
ActionChains(driver).context_click(q).perform()
time.sleep(3)
# 双击
ActionChains(driver).double_click(q).perform()
time.sleep(2)
driver.quit()