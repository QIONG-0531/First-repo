import time
import HTMLTestRunner
import os,sys,unittest

def create():
    discover = unittest.defaultTestLoader.discover("../src080402", pattern="baidu*.py", top_level_dir=None)
    print(discover)
    return discover

if __name__ == "__main__":
    curpath = sys.path[0]
    if not os.path.exists(curpath+'/resultHtml'):
        os.mkdir(curpath+'/resultHtml')
    now = time.strftime("%Y-%m-%d-%H-&M-%S",time.localtime(time.time()))
    filename = curpath+'/resultHtml/'+now +'result.html'
    with open(filename,'wb') as fp:
        runner = HTMLTestRunner.HTMLTestRunner(stream=fp,title=u'测试报告',description=u'用例执行情况',verbosity=2)
        suite = create()
        runner.run(suite)
