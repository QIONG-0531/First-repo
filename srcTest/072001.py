from selenium import webdriver
import time
driver=webdriver.Chrome()
driver.get("https://www.baidu.com/")
time.sleep(2)
driver.find_element_by_id("kw").send_keys("严浩翔")
driver.implicitly_wait(5)
driver.find_element_by_id("su").click()
time.sleep(2)
# 将页面滚动条拖到底部
js="var q=document.documentElement.scrollTop=10000"
driver.execute_script(js)
time.sleep(3)
# 将页面滚动条移动到顶端
js="var q=document.documentElement.scrollTop=0"
driver.execute_script(js)
time.sleep(3)
driver.quit()