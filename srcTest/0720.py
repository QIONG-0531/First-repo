from selenium import webdriver
import time
driver=webdriver.Chrome()
driver.get("https://www.baidu.com/")
time.sleep(2)
# 浏览器最大化
driver.maximize_window()
time.sleep(2)
# 设置浏览器的宽、高
# driver.set_window_size(280,300)
# 打印标题和url
print(driver.title)
print(driver.current_url)
# 获得文本信息
text = driver.find_element_by_id("bottom_layer").text
print(text)
driver.find_element_by_id("kw").send_keys("我爱你")
# 智能等待
driver.implicitly_wait(8)
# time.sleep(6)
# 清除内容
# driver.find_element_by_id("kw").clear()
# driver.find_element_by_id("kw").send_keys("你好")
# time.sleep(2)
# driver.find_element_by_id("su").click()
# 如果type是submit，就可以用submit来提交表单，和click作用一样
driver.find_element_by_id("su").submit()
time.sleep(3)
# 浏览器后退
driver.back()
time.sleep(3)
# 浏览器前进
driver.forward()
time.sleep(3)
driver.quit()