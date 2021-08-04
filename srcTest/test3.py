from selenium import webdriver
import time
# 鼠标事件，导入包
from selenium.webdriver.common.action_chains import ActionChains

driver = webdriver.Chrome()
driver.get("https://www.baidu.com/")
driver.find_element_by_id("kw").send_keys("ninini")
q = driver.find_element_by_id("su")
# 右击
ActionChains(driver).context_click(q).perform()
# 双击
ActionChains(driver).double_click(q).perform()
time.sleep(2)
driver.quit()