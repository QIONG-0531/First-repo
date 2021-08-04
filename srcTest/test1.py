from selenium import webdriver
import time

driver = webdriver.Chrome()
driver.get("https://www.baidu.com/")

# 打印文本信息
cp = driver.find_element_by_xpath("//*[@id='bottom_layer']/div").text
print(cp)
# 智能等待
driver.implicitly_wait(3)
# 打印标题、url
print(driver.title)
print(driver.current_url)
time.sleep(2)
# 浏览器的操作
driver.set_window_size(480, 800)
time.sleep(2)
driver.maximize_window()
time.sleep(2)
driver.find_element_by_id("kw").send_keys("你好")
driver.find_element_by_id("su").click()
time.sleep(2)
driver.back()
time.sleep(2)
driver.forward()


time.sleep(3)
driver.quit()
