from selenium import webdriver
import time
# 键盘事件，需要导入keys包
from selenium.webdriver.common.keys import Keys

driver = webdriver.Chrome()
driver.get("https://www.baidu.com/")
driver.find_element_by_id("kw").send_keys("hahah")
time.sleep(2)
# 键盘组合用法
driver.find_element_by_id("kw").send_keys(Keys.CONTROL, 'a')
time.sleep(2)
driver.find_element_by_id("kw").send_keys(Keys.CONTROL, 'x')
time.sleep(2)
# 键盘事件（用enter键来代替搜索）
driver.find_element_by_id("kw").send_keys("hahah")
driver.find_element_by_id("su").send_keys(Keys.ENTER)
time.sleep(3)
# 将页面滚动条拖到底部
js = "var q=document.documentElement.scrollTop=10000"
driver.execute_script(js)
time.sleep(3)
# 将页面滚动条拖到顶部
js = "var q=document.documentElement.scrollTop=0"
driver.execute_script(js)
time.sleep(3)
driver.quit()
