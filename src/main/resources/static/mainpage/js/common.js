
	var navEm = document.querySelector('nav em');
	navEm && navEm.addEventListener('click', function () {
		var ul = document.querySelector('nav ul');
		var display = ul.style.display;
		if (display === 'block') {
			ul.style.display = '';
		} else {
			ul.style.display = 'block';
		}
	});

	// add baidu tongji
	var _hmt = _hmt || [];
	(function () {
		var hm = document.createElement('script');
		hm.src = '//hm.baidu.com/hm.js?f6b1b97f6a69181573a62aa99207eaab';
		var s = document.getElementsByTagName('script')[0];
		s.parentNode.insertBefore(hm, s);
	})();
	// baidu tongji end


window.console.log('%c欢迎使用console查看本博客的信息 www.xiabingbao.com:', 'font-size:20px; color:#FF4040');
window.console.log('这里是博主分享经历经验的地方，在自己总结知识的同时，希望也能够帮助到大家');
window.console.log('有什么意见或建议，欢迎留言或者发送邮件：%c baibai194@gmail.com (邮件标题请注明“来自console”)', 'color:#FF4040');
