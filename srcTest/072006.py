from selenium import webdriver
import time
import os

driver=webdriver.Chrome()
url="file:///"+os.path.abspath("C:/Users/22987/Desktop/比特/selenium2html/frame.html")
driver.get(url)
# 先从默认页面跳到f1
driver.switch_to.frame("f1")
# 从f1框架中找到f2
driver.switch_to.frame('f2')
driver.find_element_by_id("kw").send_keys("布拉格")
time.sleep(2)
driver.find_element_by_id("su").click()
time.sleep(2)
# 从f2页面回到f1
# 先从f2页面回到默认页面
driver.switch_to.default_content()
# 再从默认页面跳到f1
driver.switch_to.frame("f1")
driver.find_element_by_link_text("click").click()
time.sleep(2)
driver.quit()
