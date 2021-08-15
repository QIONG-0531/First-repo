from selenium import webdriver
import time,os

driver = webdriver.Chrome()
file = 'file:///' + os.path.abspath('C:/Users/22987/Desktop/比特/selenium2html/frame.html')
driver.get(file)
# 页面出现多个frame（框架）嵌套的问题，要先跳到要定位元素的frame上，再进行操作
# 先找到f1页面
driver.switch_to.frame("f1")
# 再找到f1里面的f2页面
driver.switch_to.frame("f2")
driver.find_element_by_id("kw").send_keys("hahahha")
driver.find_element_by_id("su").click()
time.sleep(3)
# 要回到f1页面，只能先回到默认页面，再进入f1页面
driver.switch_to.default_content()
driver.switch_to.frame("f1")
driver.find_element_by_link_text("click").click()
time.sleep(3)
driver.quit()
