// assets
import {
  AppstoreAddOutlined,
  AntDesignOutlined,
  BarcodeOutlined,
  BgColorsOutlined,
  FontSizeOutlined,
  LoadingOutlined
} from '@ant-design/icons';

// icons
const icons = {
  FontSizeOutlined,
  BgColorsOutlined,
  BarcodeOutlined,
  AntDesignOutlined,
  LoadingOutlined,
  AppstoreAddOutlined
};

// ==============================|| MENU ITEMS - UTILITIES ||============================== //

const stocks = {
  id: 'stocks',
  title: 'Stocks',
  type: 'group',
  children: [
    {
      id: 'stocks-bazin',
      title: 'Bazin',
      type: 'item',
      url: '/stocks/bazin',
      icon: icons.FontSizeOutlined
    },
    {
      id: 'stocks-graham',
      title: 'Graham',
      type: 'item',
      url: '/stocks/graham',
      icon: icons.FontSizeOutlined
    },
    {
      id: 'stocks-wacc',
      title: 'Wacc',
      type: 'item',
      url: '/stocks/wacc',
      icon: icons.FontSizeOutlined
    }
  ]
};

export default stocks;
